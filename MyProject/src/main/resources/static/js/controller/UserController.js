/**
 * User Controller
 */
angular.module('TestApp').controller('UserController',function(userFactory,$scope){
	$scope.userList=[];
    $scope.editablerow = {};
    $scope.display=false;
    
    
    $scope.getUsersList=function(){
        userFactory.ajaxCall("/Rest/Students/","GET",null).then(function(response){
            //console.log(JSON.stringify(response));
            $scope.userList=response.data;
        },function(error){
            $scope.status = 'Unable to fetch Users: ' + error.message;
        })
    }

   
    $scope.getUsersList();
});