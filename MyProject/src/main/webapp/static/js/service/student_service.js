'use strict';
angular.module('myApp').factory('StudentService', [ '$http', '$q', function($http, $q) {

	var REST_URI = 'http://localhost:8080/Rest/Students/';
	var factory = {
		fetchAllStudents : fetchAllStudents,
	};

	return factory;
	fetchAllStudents();
	function fetchAllStudents() {
		var deferred = $q.defer();
		$http.get(REST_URI)
			.then(
				function(response) {
					deferred.resolve(response.data);
				},
				function(errResponse) {
					console.error('Error while fetching Students');
					deferred.reject(errResponse);
				}
		);
		return deferred.promise;
	}
} ]);