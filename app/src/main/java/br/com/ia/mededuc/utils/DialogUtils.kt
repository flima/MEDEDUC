package br.com.ia.mededuc.utils

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import br.com.ia.mededuc.R
import br.com.ia.mededuc.widget.EquipmentAcquiredView


/**
 * Created by fernandodelima on 10/12/17.
 */

class DialogUtils {

    companion object {

        fun createEquipmentDialogs(context: Context,
                                   title: String,
                                   equipments: List<String>,
                                   buttonListener: DialogInterface.OnClickListener): AlertDialog {

            val equipmentAcquiredView = LayoutInflater.from(context).inflate(R.layout.dialog_equipment_acquired, null)
            equipmentAcquiredView.findViewById<EquipmentAcquiredView>(R.id.eavImages).setupEquipments(equipments)

            return AlertDialog.Builder(context)
                    .setTitle(title)
                    .setView(equipmentAcquiredView)
                    .setPositiveButton("Ok", buttonListener)
                    .setCancelable(false)
                    .create()

        }

    }

}
