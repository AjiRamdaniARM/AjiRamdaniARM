import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'movie - apk',
      theme: ThemeData(
        appBarTheme: new AppBarTheme(
          backgroundColor: Colors.white,
          foregroundColor: Colors.black,
        ),
      ),
      home: const MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({
    Key? key,
  }) : super(key: key);
  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          "MOVIE - INDO",
          style: new TextStyle(
              color: Color.fromARGB(255, 255, 255, 255),
              fontFamily: 'Billabong'),
        ),
        titleSpacing: 00.0,
        centerTitle: true,
        toolbarHeight: 60.2,
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(360)),
        elevation: 0.00,
        backgroundColor: Colors.greenAccent[400],
      ),
      body: Stack(
        children: <Widget>[gr],
      ),
    );
  }

  get gr => Expanded(
      child: Container(
          padding: EdgeInsets.only(left: 16, right: 16, bottom: 16),
          child: GridView.count(
              crossAxisSpacing: 16,
              mainAxisSpacing: 16,
              crossAxisCount: 2,
              childAspectRatio: .90,
              children: <Widget>[
                GestureDetector(
                  onTap: () {},
                  child: Container(
                      child: Card(
                    elevation: 10,
                    shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(8)),
                    child: Center(
                      child: Column(
                        mainAxisSize: MainAxisSize.min,
                        children: <Widget>[
                          Image.network(
                              "https://vignette.wikia.nocookie.net/doraemon/images/f/fe/Poster_Doraemon_the_Movie_-_Nobita's_Dinosaur.jpg/revision/latest?cb=20200817235932&path-prefix=id"),
                          Text('data'),
                        ],
                      ),
                    ),
                  )),
                ),
              ])));
}
