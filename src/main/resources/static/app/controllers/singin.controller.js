(function() {

  'use strict';
  angular.module('app', [])
   .controller('SinginCtrl', function($scope, $http) {
     $scope.greeting = {id: '', content: 'Hello Jona good job this time!'};
     
     $http.get('/api/v1/resource').then(function(response) {
       console.log(response);
       $scope.greeting = response.data;
     });
   });
  
})();
