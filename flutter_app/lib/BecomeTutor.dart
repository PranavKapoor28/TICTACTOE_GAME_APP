import 'package:flutter/material.dart';

void main() => runApp(RequestTutor());

class RequestTutor extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final appTitle = 'Apply For A Tutor';

    return MaterialApp(
      title: appTitle,
      home: Scaffold(
        appBar: AppBar(
          title: Text(appTitle),
          backgroundColor: Colors.grey[900],
        ),
        body: SingleChildScrollView(
          child: Center(
            child: new Column(
              children: <Widget>[
                SizedBox(height: 25.0),
                Text('Enter Your Information',
                    style: TextStyle(
                      color: Colors.grey[900],
                      letterSpacing: 2.0,
                      fontSize: 28.0,
                      fontWeight: FontWeight.bold,
                    )),
                Container(
                  margin: EdgeInsets.all(73.0),
                  width: 250.0,
                  child: MyCustomForm(),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}

// Create a Form widget.
class MyCustomForm extends StatefulWidget {
  @override
  MyCustomFormState createState() {
    return MyCustomFormState();
  }
}

// Create a corresponding State class.
// This class holds data related to the form.
class MyCustomFormState extends State<MyCustomForm> {
  // Create a global key that uniquely identifies the Form widget
  // and allows validation of the form.
  //
  // Note: This is a GlobalKey<FormState>,
  // not a GlobalKey<MyCustomFormState>.
  final _formKey = GlobalKey<FormState>();

  @override
  Widget build(BuildContext context) {
    // Build a Form widget using the _formKey created above.
    return Form(
      key: _formKey,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          TextFormField(
            validator: (value) {
              if (value.isEmpty) {
                return 'Please enter your name';
              }
              return null;
            },
            decoration: InputDecoration(labelText: 'Enter your Name'),
          ),
          SizedBox(height: 20.0),
          TextFormField(
            validator: (value) {
              if (value.isEmpty) {
                return 'Please enter your Email-Address';
              }
              return null;
            },
            decoration: InputDecoration(labelText: 'Enter your Email'),
          ),
          SizedBox(height: 20.0),
          TextFormField(
            validator: (value) {
              if (value.isEmpty) {
                return 'Please enter your phone number';
              }
              return null;
            },
            decoration: InputDecoration(labelText: 'Enter your Phone Number'),
          ),
          SizedBox(height: 20.0),
          TextFormField(
            validator: (value) {
              if (value.isEmpty) {
                return 'Please enter your address';
              }
              return null;
            },
            decoration: InputDecoration(labelText: 'Enter your Address'),
          ),
          SizedBox(height: 20.0),
          TextFormField(
            validator: (value) {
              if (value.isEmpty) {
                return 'Please enter some text';
              }
              return null;
            },
            decoration: InputDecoration(
                labelText: 'Subject You Want to Teach'),
          ),
          SizedBox(height: 20.0),
          TextFormField(
            validator: (value) {
              if (value.isEmpty) {
                return 'Please enter some text';
              }
              return null;
            },
            decoration: InputDecoration(
                labelText: 'Gender.'),
          ),
          SizedBox(height: 20.0),
          TextFormField(
            validator: (value) {
              if (value.isEmpty) {
                return 'Please enter some text';
              }
              return null;
            },
            decoration: InputDecoration(
                labelText: 'Your Experience'),
          ),
          SizedBox(height: 20.0),
          TextFormField(
            validator: (value) {
              if (value.isEmpty) {
                return 'Please enter some text';
              }
              return null;
            },
            decoration: InputDecoration(
                labelText: 'Enter your Education'),
          ),
          SizedBox(height: 20.0),
          Padding(
            padding: const EdgeInsets.symmetric(vertical: 16.0),
            child: RaisedButton(
              onPressed: () {
                // Validate returns true if the form is valid, or false
                // otherwise.
                if (_formKey.currentState.validate()) {
                  // If the form is valid, display a Snackbar.
                  Scaffold.of(context).showSnackBar(
                      SnackBar(content: Text('Data Entered Successfully')));
                }
              },
              child: Text('Submit'),
            ),
          ),
        ],
      ),
    );
  }
}
