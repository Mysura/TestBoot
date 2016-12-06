var application=angular.module('TestApp',['ngRoute','userFactoryModule']);

/*application.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: '/'
    });

    $routeProvider.otherwise({redirectTo: '/sgds'});
}]);*/
/*application.controller('testController',function($scope,userFactory){
    $scope.userList=[];
    $scope.editablerow = {};
    $scope.display=false;
    
    $scope.loadTemplate = function(user) { 
    	if(user.id!=undefined){
	        if (user.id == $scope.editablerow.id)
	            return 'edit';
	        else 
	        return 'view';
	    }
    }
    
    $scope.getUsersList=function(){
        userFactory.ajaxCall("/getUsers","GET",null).then(function(response){
            //console.log(JSON.stringify(response));
            $scope.userList=response.data;
        },function(error){
            $scope.status = 'Unable to fetch Users: ' + error.message;
        })
    }

    $scope.addEmployee=function(){
        var userObject={
                        "id":$scope.userList.length+1,
                        "name":$scope.empName,
                        "age":$scope.empAge
                        };
        //$scope.userList.push();
        userFactory.ajaxCall("/addUser","POST",userObject).then(function (response) {
        		//console.log(response);
                $scope.status = 'Inserted User! Refreshing Users list.';
                $scope.getUsersList();
            }, function(error) {
                $scope.status = 'Unable to insert User: ' + error.message;
            });
        $scope.empName="";
        $scope.empAge="";
    }

    $scope.editEmployee = function (user) {
        $scope.editablerow = angular.copy(user);
    };

    $scope.saveEmployee=function(user){
       // $scope.userList[idx]=angular.copy($scope.editablerow);
    	userFactory.ajaxCall("/updateUser","PUT",user).then(function (response) {
    		console.log(response);
            $scope.status = 'Updated User! Refreshing Users list.';
            $scope.reset();
            $scope.getUsersList();
        }, function(error) {
            $scope.status = 'Unable to Update User: ' + error.message;
        });
        //$scope.reset();
    }

    $scope.removeEmployee=function(user){
        //$scope.userList.splice(idx,1);
    	userFactory.ajaxCall("/deleteUser","DELETE",user).then(function(response){
    		$scope.status = 'User Deleted! Refreshing Users list';
    		$scope.getUsersList();
    	},function(error){
    		$scope.status = 'Unable to delete User: ' + error.message;
    	})
    }
    $scope.reset = function(){
        $scope.editablerow = [];
    }
    $scope.getUsersList();
})*/