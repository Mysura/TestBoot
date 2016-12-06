'use strict';

angular.module('myApp').controller('StudentController', [ '$scope', 'StudentService', function($scope, StudentService) {
	var self = this;

	self.student = {
		id : null,
		name : ''
	};
	self.students = [];
	fetchAllStudents();

	function fetchAllStudents() {
		StudentService.fetchAllStudents()
			.then(
				function(d) {
					self.students = d;
				},
				function(errResponse) {
					console.error('Error while fetching Students');
				}
		);
	}

} ]);