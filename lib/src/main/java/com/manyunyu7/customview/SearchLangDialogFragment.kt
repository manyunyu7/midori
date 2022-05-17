package com.manyunyu7.customview

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.manyunyu7.lib.R
import com.manyunyu7.lib.databinding.ManyunyuSearchModalBinding


class SearchLangDialogFragment : DialogFragment() {

    private var yesText = ""
    private var negativeText = ""


    private var _binding: ManyunyuSearchModalBinding? = null

    // This property is only valid between onCreateDialog and
    // onDestroyView.
    val binding get() = _binding!!

    lateinit var positiveAction: (text: String) -> Unit?

    lateinit private var langDialogFragmentInterface: SearchLangDialogFragmentInterface

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = ManyunyuSearchModalBinding.inflate(LayoutInflater.from(context))
        langDialogFragmentInterface.getBinding(binding)
        return AlertDialog.Builder(requireActivity())
            .setView(binding.root)
            .create()
    }


    fun setDialogInterface(mInterface: SearchLangDialogFragmentInterface) {
        this.langDialogFragmentInterface = mInterface
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.manyunyu_search_modal, container)
    }

    /*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = ManyunyuSearchModalBinding.bind(view)
    }
     */


}

interface SearchLangDialogFragmentInterface {
    fun getBinding(binding: ManyunyuSearchModalBinding)
}