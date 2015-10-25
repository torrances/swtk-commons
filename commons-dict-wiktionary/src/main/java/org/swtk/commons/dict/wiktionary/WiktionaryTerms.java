package org.swtk.commons.dict.wiktionary;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.swtk.common.framework.type.Alpha;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsA;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsB;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsC;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsD;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsE;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsF;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsG;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsH;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsI;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsJ;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsK;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsL;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsM;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsN;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsO;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsP;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsQ;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsR;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsS;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsT;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsU;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsV;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsW;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsX;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsY;
import org.swtk.commons.dict.wiktionary.terms.WiktionaryTermsZ;

public final class WiktionaryTerms {

	public static Collection<String> terms() {
		Set<String> set = new TreeSet<String>();

		for (Alpha alpha : Alpha.values())
			set.addAll(terms(alpha));

		return set;
	}

	public static Collection<String> terms(Alpha alpha) {

		if (Alpha.A == alpha) return WiktionaryTermsA.terms();
		if (Alpha.B == alpha) return WiktionaryTermsB.terms();
		if (Alpha.C == alpha) return WiktionaryTermsC.terms();
		if (Alpha.D == alpha) return WiktionaryTermsD.terms();
		if (Alpha.E == alpha) return WiktionaryTermsE.terms();
		if (Alpha.F == alpha) return WiktionaryTermsF.terms();
		if (Alpha.G == alpha) return WiktionaryTermsG.terms();
		if (Alpha.H == alpha) return WiktionaryTermsH.terms();
		if (Alpha.I == alpha) return WiktionaryTermsI.terms();
		if (Alpha.J == alpha) return WiktionaryTermsJ.terms();
		if (Alpha.K == alpha) return WiktionaryTermsK.terms();
		if (Alpha.L == alpha) return WiktionaryTermsL.terms();
		if (Alpha.M == alpha) return WiktionaryTermsM.terms();
		if (Alpha.N == alpha) return WiktionaryTermsN.terms();
		if (Alpha.O == alpha) return WiktionaryTermsO.terms();
		if (Alpha.P == alpha) return WiktionaryTermsP.terms();
		if (Alpha.Q == alpha) return WiktionaryTermsQ.terms();
		if (Alpha.R == alpha) return WiktionaryTermsR.terms();
		if (Alpha.S == alpha) return WiktionaryTermsS.terms();
		if (Alpha.T == alpha) return WiktionaryTermsT.terms();
		if (Alpha.U == alpha) return WiktionaryTermsU.terms();
		if (Alpha.V == alpha) return WiktionaryTermsV.terms();
		if (Alpha.W == alpha) return WiktionaryTermsW.terms();
		if (Alpha.X == alpha) return WiktionaryTermsX.terms();
		if (Alpha.Y == alpha) return WiktionaryTermsY.terms();
		if (Alpha.Z == alpha) return WiktionaryTermsZ.terms();

		return null;
	}

	public static Map<Alpha, Collection<String>> termsByAlpha() {
		Map<Alpha, Collection<String>> map = new TreeMap<Alpha, Collection<String>>();

		for (Alpha alpha : Alpha.values())
			map.put(alpha, terms(alpha));

		return map;
	}
}
