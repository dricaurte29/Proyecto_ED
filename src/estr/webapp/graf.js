new Morris.Area({
    // ID of the element in which to draw the chart.
    element: 'myfirstchart',
    // Chart data records -- each entry in this array corresponds to a point on
    // the chart.
    data: [
      { day: '20', value: 26 },
      { day: '21', value: 45 },
      { day: '22', value: 15 },
      { day: '23', value: 35 },
      { day: '24', value: 32},
      { day: '25', value: 17 },
      { day: '26', value: 49 },
      { day: '27', value: 18},
      { day: '28', value: 34 },
      { day: '29', value: 38 },
      { day: '30', value: 34 },
      { day: '31', value: 23 },
      { day: '19', value: 19 },
      { day: '18', value: 43 },
      { day: '17', value: 34 },
      { day: '16', value: 26 },
    ],
    // The name of the data record attribute that contains x-values.
    xkey: 'day',
    // A list of names of data record attributes that contain y-values.
    ykeys: ['value'],
    // Labels for the ykeys -- will be displayed when you hover over the
    // chart.
    labels: ['Casos'],
    xLabels: "day",
    resize: true,
    lineColors: ['#FF5464','#FF5464'],
    
  });
  Morris.Donut({
    element: 'graph',
    data: [
      {value: 45.3, label: 'Contagiados'},
      {value: 54.7, label: 'No contagiados'}
    ],
    colors: ['#FF5464','#54FFAF'],
    formatter: function (x) { return x + "%"}
  }).on('click', function(i, row){
    console.log(i, row);
  });