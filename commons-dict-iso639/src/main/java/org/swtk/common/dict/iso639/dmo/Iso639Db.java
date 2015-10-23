package org.swtk.common.dict.iso639.dmo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.swtk.common.dict.dto.iso639.Language;
import org.swtk.common.dict.iso639.generated.Iso639Exceptional;
import org.swtk.common.dict.iso639.generated.Iso639_A1;
import org.swtk.common.dict.iso639.generated.Iso639_B1;
import org.swtk.common.dict.iso639.generated.Iso639_C1;
import org.swtk.common.dict.iso639.generated.Iso639_D1;
import org.swtk.common.dict.iso639.generated.Iso639_E1;
import org.swtk.common.dict.iso639.generated.Iso639_F1;
import org.swtk.common.dict.iso639.generated.Iso639_G1;
import org.swtk.common.dict.iso639.generated.Iso639_H1;
import org.swtk.common.dict.iso639.generated.Iso639_I1;
import org.swtk.common.dict.iso639.generated.Iso639_J1;
import org.swtk.common.dict.iso639.generated.Iso639_K1;
import org.swtk.common.dict.iso639.generated.Iso639_L1;
import org.swtk.common.dict.iso639.generated.Iso639_M1;
import org.swtk.common.dict.iso639.generated.Iso639_N1;
import org.swtk.common.dict.iso639.generated.Iso639_O1;
import org.swtk.common.dict.iso639.generated.Iso639_P1;
import org.swtk.common.dict.iso639.generated.Iso639_Q1;
import org.swtk.common.dict.iso639.generated.Iso639_R1;
import org.swtk.common.dict.iso639.generated.Iso639_S1;
import org.swtk.common.dict.iso639.generated.Iso639_T1;
import org.swtk.common.dict.iso639.generated.Iso639_U1;
import org.swtk.common.dict.iso639.generated.Iso639_V1;
import org.swtk.common.dict.iso639.generated.Iso639_W1;
import org.swtk.common.dict.iso639.generated.Iso639_X1;
import org.swtk.common.dict.iso639.generated.Iso639_Y1;
import org.swtk.common.dict.iso639.generated.Iso639_Z1;
import org.swtk.common.dict.iso639.generated.IsoTwoLetterCodes;

import com.trimc.blogger.commons.LogManager;

public final class Iso639Db {

	public static LogManager logger = new LogManager(Iso639Db.class);

	public static Language findById(String id) {

		if (Iso639Exceptional.hasById(id)) return Iso639Exceptional.findById(id);
		if (2 == id.length() && IsoTwoLetterCodes.hasById(id)) return IsoTwoLetterCodes.findById(id);

		if (id.startsWith("a")) return Iso639_A1.findById(id);
		if (id.startsWith("b")) return Iso639_B1.findById(id);
		if (id.startsWith("c")) return Iso639_C1.findById(id);
		if (id.startsWith("d")) return Iso639_D1.findById(id);
		if (id.startsWith("e")) return Iso639_E1.findById(id);
		if (id.startsWith("f")) return Iso639_F1.findById(id);
		if (id.startsWith("g")) return Iso639_G1.findById(id);
		if (id.startsWith("h")) return Iso639_H1.findById(id);
		if (id.startsWith("i")) return Iso639_I1.findById(id);
		if (id.startsWith("j")) return Iso639_J1.findById(id);
		if (id.startsWith("l")) return Iso639_L1.findById(id);
		if (id.startsWith("m")) return Iso639_M1.findById(id);
		if (id.startsWith("n")) return Iso639_N1.findById(id);
		if (id.startsWith("o")) return Iso639_O1.findById(id);
		if (id.startsWith("p")) return Iso639_P1.findById(id);
		if (id.startsWith("q")) return Iso639_Q1.findById(id);
		if (id.startsWith("r")) return Iso639_R1.findById(id);
		if (id.startsWith("s")) return Iso639_S1.findById(id);
		if (id.startsWith("t")) return Iso639_T1.findById(id);
		if (id.startsWith("u")) return Iso639_U1.findById(id);
		if (id.startsWith("v")) return Iso639_V1.findById(id);
		if (id.startsWith("w")) return Iso639_W1.findById(id);
		if (id.startsWith("x")) return Iso639_X1.findById(id);
		if (id.startsWith("y")) return Iso639_Y1.findById(id);
		if (id.startsWith("z")) return Iso639_Z1.findById(id);

		return null;
	}

	public static Language findByName(String name) {

		if (Iso639Exceptional.hasByName(name)) return Iso639Exceptional.findByName(name);
		if (IsoTwoLetterCodes.hasByName(name)) return IsoTwoLetterCodes.findByName(name);

		if (Iso639_A1.hasByName(name)) return Iso639_A1.findByName(name);
		if (Iso639_B1.hasByName(name)) return Iso639_B1.findByName(name);
		if (Iso639_C1.hasByName(name)) return Iso639_C1.findByName(name);
		if (Iso639_D1.hasByName(name)) return Iso639_D1.findByName(name);
		if (Iso639_E1.hasByName(name)) return Iso639_E1.findByName(name);
		if (Iso639_F1.hasByName(name)) return Iso639_F1.findByName(name);
		if (Iso639_G1.hasByName(name)) return Iso639_G1.findByName(name);
		if (Iso639_H1.hasByName(name)) return Iso639_H1.findByName(name);
		if (Iso639_I1.hasByName(name)) return Iso639_I1.findByName(name);
		if (Iso639_J1.hasByName(name)) return Iso639_J1.findByName(name);
		if (Iso639_K1.hasByName(name)) return Iso639_K1.findByName(name);
		if (Iso639_L1.hasByName(name)) return Iso639_L1.findByName(name);
		if (Iso639_M1.hasByName(name)) return Iso639_M1.findByName(name);
		if (Iso639_N1.hasByName(name)) return Iso639_N1.findByName(name);
		if (Iso639_O1.hasByName(name)) return Iso639_O1.findByName(name);
		if (Iso639_P1.hasByName(name)) return Iso639_P1.findByName(name);
		if (Iso639_Q1.hasByName(name)) return Iso639_Q1.findByName(name);
		if (Iso639_R1.hasByName(name)) return Iso639_R1.findByName(name);
		if (Iso639_S1.hasByName(name)) return Iso639_S1.findByName(name);
		if (Iso639_T1.hasByName(name)) return Iso639_T1.findByName(name);
		if (Iso639_U1.hasByName(name)) return Iso639_U1.findByName(name);
		if (Iso639_V1.hasByName(name)) return Iso639_V1.findByName(name);
		if (Iso639_W1.hasByName(name)) return Iso639_W1.findByName(name);
		if (Iso639_X1.hasByName(name)) return Iso639_X1.findByName(name);
		if (Iso639_Y1.hasByName(name)) return Iso639_Y1.findByName(name);
		if (Iso639_Z1.hasByName(name)) return Iso639_Z1.findByName(name);

		return null;
	}

	public static Map<String, Collection<String>> getLanguageNamesWithVariantsAsMap() {
		Map<String, Collection<String>> map = new TreeMap<String, Collection<String>>();

		map.putAll(Iso639Exceptional.getLanguageNamesWithVariantsAsMap());
		map.putAll(IsoTwoLetterCodes.getLanguageNamesWithVariantsAsMap());

		map.putAll(Iso639_A1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_B1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_C1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_D1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_E1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_F1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_G1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_H1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_I1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_J1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_K1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_L1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_M1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_N1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_O1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_P1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_Q1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_R1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_S1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_T1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_U1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_V1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_W1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_X1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_Y1.getLanguageNamesWithVariantsAsMap());
		map.putAll(Iso639_Z1.getLanguageNamesWithVariantsAsMap());

		return map;
	}

	public static Collection<String> getLanguageNamesWithVariantsAsSet() {
		Set<String> set = new TreeSet<String>();

		set.addAll(Iso639Exceptional.getLanguageNamesWithVariantsAsSet());
		set.addAll(IsoTwoLetterCodes.getLanguageNamesWithVariantsAsSet());

		set.addAll(Iso639_A1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_B1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_C1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_D1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_E1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_F1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_G1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_H1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_I1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_J1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_K1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_L1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_M1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_N1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_O1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_P1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_Q1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_R1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_S1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_T1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_U1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_V1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_W1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_X1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_Y1.getLanguageNamesWithVariantsAsSet());
		set.addAll(Iso639_Z1.getLanguageNamesWithVariantsAsSet());

		return set;
	}

	public static boolean hasById(String id) {
		return null != findById(id);
	}

	public static boolean hasByName(String name) {
		return null != findByName(name);
	}
}
