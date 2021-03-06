package org.swtk.common.dict.iso639.generated;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.swtk.common.dict.dto.iso639.Language;
import org.swtk.common.dict.dto.iso639.adapter.LanguageAdapter;
import org.swtk.common.dict.iso639.utils.Iso639Utils;

/**	  * 	AUTO-GENERATED  * 		time 		<1445407051490>  * 		activity 	<public class org.swtk.common.dict.iso639.Runner>  * 		url			<https://github.com/torrances/swtk-data>  * 		agent 		<cmtrim>  * 	DO NOT MODIFY THIS CLASS  * 	CONTENTS ARE AUTOMATICALLY REPLACED BY MDA ROUTINE  */
public final class Iso639_F1 {
	private static Map<Integer, Language> map = new HashMap<Integer, Language>();

	static {
		add("faa				I	L	Fasu	");
		add("fab				I	L	Fa d'Ambu	");
		add("fad				I	L	Wagi	");
		add("faf				I	L	Fagani	");
		add("fag				I	L	Finongan	");
		add("fah				I	L	Baissa Fali	");
		add("fai				I	L	Faiwol	");
		add("faj				I	L	Faita	");
		add("fak				I	L	Fang (Cameroon)	");
		add("fal				I	L	South Fali	");
		add("fam				I	L	Fam	");
		add("fan	fan	fan		I	L	Fang (Equatorial Guinea)	");
		add("fao	fao	fao	fo	I	L	Faroese	");
		add("fap				I	L	Palor	");
		add("far				I	L	Fataleka	");
		add("fas	per	fas	fa	M	L	Persian	");
		add("fat	fat	fat		I	L	Fanti	");
		add("fau				I	L	Fayu	");
		add("fax				I	L	Fala	");
		add("fay				I	L	Southwestern Fars	");
		add("faz				I	L	Northwestern Fars	");
		add("fbl				I	L	West Albay Bikol	");
		add("fcs				I	L	Quebec Sign Language	");
		add("fer				I	L	Feroge	");
		add("ffi				I	L	Foia Foia	");
		add("ffm				I	L	Maasina Fulfulde	");
		add("fgr				I	L	Fongoro	");
		add("fia				I	L	Nobiin	");
		add("fie				I	L	Fyer	");
		add("fij	fij	fij	fj	I	L	Fijian	");
		add("fil	fil	fil		I	L	Filipino	");
		add("fin	fin	fin	fi	I	L	Finnish	");
		add("fip				I	L	Fipa	");
		add("fir				I	L	Firan	");
		add("fit				I	L	Tornedalen Finnish	");
		add("fiw				I	L	Fiwaga	");
		add("fkk				I	L	Kirya-Konzəl	");
		add("fkv				I	L	Kven Finnish	");
		add("fla				I	L	Kalispel-Pend d'Oreille	");
		add("flh				I	L	Foau	");
		add("fli				I	L	Fali	");
		add("fll				I	L	North Fali	");
		add("fln				I	E	Flinders Island	");
		add("flr				I	L	Fuliiru	");
		add("fly				I	L	Flaaitaal	");
		add("fmp				I	L	Fe'fe'	");
		add("fmu				I	L	Far Western Muria	");
		add("fng				I	L	Fanagalo	");
		add("fni				I	L	Fania	");
		add("fod				I	L	Foodo	");
		add("foi				I	L	Foi	");
		add("fom				I	L	Foma	");
		add("fon	fon	fon		I	L	Fon	");
		add("for				I	L	Fore	");
		add("fos				I	E	Siraya	");
		add("fpe				I	L	Fernando Po Creole English	");
		add("fqs				I	L	Fas	");
		add("fra	fre	fra	fr	I	L	French	");
		add("frc				I	L	Cajun French	");
		add("frd				I	L	Fordata	");
		add("frk				I	E	Frankish	");
		add("frm	frm	frm		I	H	Middle French (ca. 1400-1600)	");
		add("fro	fro	fro		I	H	Old French (842-ca. 1400)	");
		add("frp				I	L	Arpitan	");
		add("frq				I	L	Forak	");
		add("frr	frr	frr		I	L	Northern Frisian	");
		add("frs	frs	frs		I	L	Eastern Frisian	");
		add("frt				I	L	Fortsenal	");
		add("fry	fry	fry	fy	I	L	Western Frisian	");
		add("fse				I	L	Finnish Sign Language	");
		add("fsl				I	L	French Sign Language	");
		add("fss				I	L	Finland-Swedish Sign Language	");
		add("fub				I	L	Adamawa Fulfulde	");
		add("fuc				I	L	Pulaar	");
		add("fud				I	L	East Futuna	");
		add("fue				I	L	Borgu Fulfulde	");
		add("fuf				I	L	Pular	");
		add("fuh				I	L	Western Niger Fulfulde	");
		add("fui				I	L	Bagirmi Fulfulde	");
		add("fuj				I	L	Ko	");
		add("ful	ful	ful	ff	M	L	Fulah	");
		add("fum				I	L	Fum	");
		add("fun				I	L	Fulniô	");
		add("fuq				I	L	Central-Eastern Niger Fulfulde	");
		add("fur	fur	fur		I	L	Friulian	");
		add("fut				I	L	Futuna-Aniwa	");
		add("fuu				I	L	Furu	");
		add("fuv				I	L	Nigerian Fulfulde	");
		add("fuy				I	L	Fuyug	");
		add("fvr				I	L	Fur	");
		add("fwa				I	L	Fwâi	");
		add("fwe				I	L	Fwe	");
	}

	private static void add(String line) {
		try {
			Language entity = LanguageAdapter.transform(line);
			map.put(entity.hashCode(), entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Language findById(String id) {
		return Iso639Utils.findById(id, map);
	}

	public static Language findByName(String name) {
		return Iso639Utils.findByName(name, map);
	}

	public static Map<String, Collection<String>> getLanguageNamesWithVariantsAsMap() {
		return Iso639Utils.getLanguageNamesWithVariantsAsMap(map);
	}

	public static Collection<String> getLanguageNamesWithVariantsAsSet() {
		return Iso639Utils.getLanguageNamesWithVariantsAsSet(map);
	}

	public static boolean hasById(String id) {
		return null != findById(id);
	}

	public static boolean hasByName(String name) {
		return null != findByName(name);
	}
}