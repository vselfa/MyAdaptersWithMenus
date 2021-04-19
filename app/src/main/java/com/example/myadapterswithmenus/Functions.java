package com.example.myadapterswithmenus;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

public class Functions {

    public void displayToast (String text, Context myContext) {
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(myContext, text, duration);
        toast.show();
    }
    public void buildDialog (String title, final String message, final Context myContext ) {
        AlertDialog.Builder builder = new AlertDialog.Builder(myContext);
        builder.setTitle(title);       builder.setMessage(message);
        builder.setIcon(R.drawable.adapters);
        builder.setPositiveButton("OK",   new DialogInterface.OnClickListener() {
            @Override
            public void onClick (DialogInterface dialog, int which) {
                displayToast ("Has fes click en OK. El valor de which és: " + which, myContext);
            }
        });
        /*builder.setNegativeButton("NO",   new DialogInterface.OnClickListener() {
            @Override
            public void onClick (DialogInterface dialog, int which) {
                displayToast ("Has fes click en NO. El valor de which és: " + which, myContext);
            }
        });*/
        builder.create();
        builder.show();
    }

    // message: Incompatible using a list into a dialog: Both use the same place!!!
    public void buildDialogList (String title , final Context myContext) {
        final String[] items = { "Blanc", "Groc",  "Blau"};
        AlertDialog.Builder builder = new AlertDialog.Builder(myContext);
        builder.setTitle(title);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayToast ("Has triat el color " + items[which], myContext);
            }
        });
        builder.setNegativeButton("Cancel", null);
        builder.setNeutralButton ("NO", null);
        builder.create();
        builder.show();
    }

    public void newBuildDialog (String title, String message, String textButton, Context myContext) {
        AlertDialog.Builder builder = new AlertDialog.Builder(myContext);
        builder.setTitle(title);       builder.setMessage(message);
        builder.setPositiveButton(textButton, null);
        builder.create();        builder.show();
    }

    public void buildDialogJoan(String title, int message, Context myContext){
        AlertDialog.Builder builder = new AlertDialog.Builder(myContext);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("Aceptar", null);
        builder.create();
        builder.show();
    }


}
