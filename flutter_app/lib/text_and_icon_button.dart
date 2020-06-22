import 'package:flutter/material.dart';
import 'package:flutterapp/RequestTutor.dart';

class TextAndIconButton extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(

      appBar: AppBar(
        title: Text('EasyTutor'),
        backgroundColor: Colors.grey[800],
      ),
    body: SingleChildScrollView(
    child: Center(
      child: new Column(
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: <Widget>[
          SizedBox(height: 25.0),
      Text('Select Your Service',
          style: TextStyle(
            color: Colors.grey[900],
            letterSpacing: 2.0,
            fontSize: 38.0,
            fontWeight: FontWeight.bold,
          )),
          SizedBox(height: 120.0),
      new Row(
      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: <Widget>[

        Container(
          height:150.0,
          width: 200.0,
          child:RaisedButton(
            shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(14.0),

                side: BorderSide(color: Colors.yellowAccent)),
            onPressed: () {},
            color: Colors.grey.shade600,
            textColor: Colors.yellowAccent,
            child: Text("Request a Tutor".toUpperCase(),
                style: TextStyle(fontSize: 14)),
          ),
          ),
      Container(
        height:150.0,
        width: 200.0,
        child:RaisedButton(
          shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(14.0),
              side: BorderSide(color: Colors.yellowAccent)),
          onPressed: () {},
          color: Colors.grey.shade600,
          textColor: Colors.yellowAccent,
          child: Text("Become a Tutor".toUpperCase(),
              style: TextStyle(fontSize: 14)),
        ),
      ),
      ],
    ),
          SizedBox(height: 40.0),
      new Row(
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: <Widget>[
        Container(
        height:150.0,
        width: 200.0,
        child:RaisedButton(
            shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(14.0),
                side: BorderSide(color: Colors.yellowAccent)),
            onPressed: () {},
            color: Colors.grey.shade600,
            textColor: Colors.yellowAccent,
            child: Text("Visa Assistance".toUpperCase(),
                style: TextStyle(fontSize: 14)),
          ),
      ),

      Container(
        height:150.0,
        width: 200.0,
        child:RaisedButton(
            shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(14.0),
                side: BorderSide(color: Colors.yellowAccent)),
            onPressed: () {},
            color: Colors.grey.shade600,
            textColor: Colors.yellowAccent,
            child: Text("Online Internship".toUpperCase(),
                style: TextStyle(fontSize: 14)),
          ),
      ),
        ],
      ),
          SizedBox(height: 40.0),
      Container(
        height:150.0,
        width: 200.0,
        child:RaisedButton(
            shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(14.0),
                side: BorderSide(color: Colors.yellowAccent)),
            onPressed: () {},
            color: Colors.grey.shade600,
            textColor: Colors.yellowAccent,
            child: Text("Assignment Help".toUpperCase(),
                style: TextStyle(fontSize: 14)),
          ),
      ),
      ],
      ),
    ),
    ),
    );
  }
}