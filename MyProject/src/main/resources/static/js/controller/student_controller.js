'use strict';

angular.module('TestApp').controller('StudentController',function(StudentService,$scope){
	$scope.students=[];
    $scope.editablerow = {};
    $scope.display=false;
    
    $scope.getUsersList();
    $scope.getUsersList=function(){
        userFactory.ajaxCall("/Rest/Students/","GET",null).then(function(response){
            //console.log(JSON.stringify(response));
            $scope.students=response.data;
        },function(error){
            $scope.status = 'Unable to fetch Users: ' + error.message;
        })
    }

});