package org.swtk.common.dict.iso639.generated;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.Entity;
import org.swtk.common.dict.dto.adapter.EntityAdapter;
import org.swtk.common.dict.iso639.utils.Iso639Utils;

/**	  * 	AUTO-GENERATED  * 		time 		<1445403627692>  * 		activity 	<public class org.swtk.common.dict.iso639.Runner>  * 		url			<https://github.com/torrances/swtk-data>  * 		agent 		<cmtrim>  * 	DO NOT MODIFY THIS CLASS  * 	CONTENTS ARE AUTOMATICALLY REPLACED BY MDA ROUTINE  */
public final class Iso639_V1 {
	private static Map<Integer, Entity> map = new HashMap<Integer, Entity>();

	static {
		add("vaa				I	L	Vaagri Booli	");
		add("vae				I	L	Vale	");
		add("vaf				I	L	Vafsi	");
		add("vag				I	L	Vagla	");
		add("vah				I	L	Varhadi-Nagpuri	");
		add("vai	vai	vai		I	L	Vai	");
		add("vaj				I	L	Sekele	");
		add("val				I	L	Vehes	");
		add("vam				I	L	Vanimo	");
		add("van				I	L	Valman	");
		add("vao				I	L	Vao	");
		add("vap				I	L	Vaiphei	");
		add("var				I	L	Huarijio	");
		add("vas				I	L	Vasavi	");
		add("vau				I	L	Vanuma	");
		add("vav				I	L	Varli	");
		add("vay				I	L	Wayu	");
		add("vbb				I	L	Southeast Babar	");
		add("vbk				I	L	Southwestern Bontok	");
		add("vec				I	L	Venetian	");
		add("ved				I	L	Veddah	");
		add("vel				I	L	Veluws	");
		add("vem				I	L	Vemgo-Mabas	");
		add("ven	ven	ven	ve	I	L	Venda	");
		add("veo				I	E	Ventureño	");
		add("vep				I	L	Veps	");
		add("ver				I	L	Mom Jango	");
		add("vgr				I	L	Vaghri	");
		add("vgt				I	L	Vlaamse Gebarentaal	");
		add("vic				I	L	Virgin Islands Creole English	");
		add("vid				I	L	Vidunda	");
		add("vie	vie	vie	vi	I	L	Vietnamese	");
		add("vif				I	L	Vili	");
		add("vig				I	L	Viemo	");
		add("vil				I	L	Vilela	");
		add("vin				I	L	Vinza	");
		add("vis				I	L	Vishavan	");
		add("vit				I	L	Viti	");
		add("viv				I	L	Iduna	");
		add("vka				I	E	Kariyarra	");
		add("vki				I	L	Ija-Zuba	");
		add("vkj				I	L	Kujarge	");
		add("vkk				I	L	Kaur	");
		add("vkl				I	L	Kulisusu	");
		add("vkm				I	E	Kamakan	");
		add("vko				I	L	Kodeoha	");
		add("vkp				I	L	Korlai Creole Portuguese	");
		add("vkt				I	L	Tenggarong Kutai Malay	");
		add("vku				I	L	Kurrama	");
		add("vlp				I	L	Valpei	");
		add("vls				I	L	Vlaams	");
		add("vma				I	L	Martuyhunira	");
		add("vmb				I	E	Barbaram	");
		add("vmc				I	L	Juxtlahuaca Mixtec	");
		add("vmd				I	L	Mudu Koraga	");
		add("vme				I	L	East Masela	");
		add("vmf				I	L	Mainfränkisch	");
		add("vmg				I	L	Lungalunga	");
		add("vmh				I	L	Maraghei	");
		add("vmi				I	E	Miwa	");
		add("vmj				I	L	Ixtayutla Mixtec	");
		add("vmk				I	L	Makhuwa-Shirima	");
		add("vml				I	E	Malgana	");
		add("vmm				I	L	Mitlatongo Mixtec	");
		add("vmp				I	L	Soyaltepec Mazatec	");
		add("vmq				I	L	Soyaltepec Mixtec	");
		add("vmr				I	L	Marenje	");
		add("vms				I	E	Moksela	");
		add("vmu				I	E	Muluridyi	");
		add("vmv				I	E	Valley Maidu	");
		add("vmw				I	L	Makhuwa	");
		add("vmx				I	L	Tamazola Mixtec	");
		add("vmy				I	L	Ayautla Mazatec	");
		add("vmz				I	L	Mazatlán Mazatec	");
		add("vnk				I	L	Vano	");
		add("vnm				I	L	Vinmavis	");
		add("vnp				I	L	Vunapu	");
		add("vol	vol	vol	vo	I	C	Volapük	");
		add("vor				I	L	Voro	");
		add("vot	vot	vot		I	L	Votic	");
		add("vra				I	L	Vera'a	");
		add("vro				I	L	Võro	");
		add("vrs				I	L	Varisi	");
		add("vrt				I	L	Burmbar	");
		add("vsi				I	L	Moldova Sign Language	");
		add("vsl				I	L	Venezuelan Sign Language	");
		add("vsv				I	L	Valencian Sign Language	");
		add("vto				I	L	Vitou	");
		add("vum				I	L	Vumbu	");
		add("vun				I	L	Vunjo	");
		add("vut				I	L	Vute	");
		add("vwa				I	L	Awa (China)	");
	}

	private static void add(String line) {
		try {
			Entity entity = EntityAdapter.transform(line);
			map.put(entity.hashCode(), entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Entity findById(String id) {
		return Iso639Utils.findById(id, map);
	}

	public static Entity findByName(String name) {
		return Iso639Utils.findByName(name, map);
	}

	public static Map<String, Collection<String>> getLanguageNamesWithVariantsAsMap() {
		return Iso639Utils.getLanguageNamesWithVariantsAsMap(map);
	}

	public static Collection<String> getLanguageNamesWithVariantsAsSet() {
		return Iso639Utils.getLanguageNamesWithVariantsAsSet(map);
	}
}