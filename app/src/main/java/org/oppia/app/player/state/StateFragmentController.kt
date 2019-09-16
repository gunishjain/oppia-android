package org.oppia.app.player.state

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.oppia.app.databinding.ExplorationFragmentBinding
import org.oppia.app.databinding.HomeFragmentBinding
import org.oppia.app.databinding.StateFragmentBinding
import org.oppia.app.fragment.FragmentScope
import javax.inject.Inject

/** The controller for [StateFragment]. */
@FragmentScope
class StateFragmentController @Inject constructor(
  private val fragment: Fragment
) {
  fun handleCreateView(inflater: LayoutInflater, container: ViewGroup?): View? {
    val binding = StateFragmentBinding.inflate(inflater, container, /* attachToRoot= */ false)
    return binding.root
  }
}