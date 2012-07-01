package br.ufla.dcc.event.wuc;

import br.ufla.dcc.grubix.simulator.Address;
import br.ufla.dcc.grubix.simulator.event.WakeUpCall;

public class BackboneCandidateWUC extends WakeUpCall {

	public BackboneCandidateWUC(Address sender, double delay) {
		super(sender, delay);
	}

	public BackboneCandidateWUC(Address sender) {
		super(sender);
	}
}
