Morris.Donut({
    element: 'dona',
    data: [
      {value: 15, label: ''},
      {value: 75, label: ''}
    ],
    colors: ['#FF5464','#54FFAF'],
    formatter: function (x) { return x + "%"}
  }).on('click', function(i, row){
    console.log(i, row);
  });