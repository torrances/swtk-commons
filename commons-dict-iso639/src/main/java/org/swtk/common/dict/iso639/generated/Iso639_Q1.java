package org.swtk.common.dict.iso639.generated;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.Entity;
import org.swtk.common.dict.dto.adapter.EntityAdapter;
import org.swtk.common.dict.iso639.utils.Iso639Utils;

/**	  * 	AUTO-GENERATED  * 		time 		<1445404144474>  * 		activity 	<public class org.swtk.common.dict.iso639.Runner>  * 		url			<https://github.com/torrances/swtk-data>  * 		agent 		<cmtrim>  * 	DO NOT MODIFY THIS CLASS  * 	CONTENTS ARE AUTOMATICALLY REPLACED BY MDA ROUTINE  */
public final class Iso639_Q1 {
	private static Map<Integer, Entity> map = new HashMap<Integer, Entity>();

	static {
		add("qua				I	L	Quapaw	");
		add("qub				I	L	Huallaga Huánuco Quechua	");
		add("quc				I	L	K'iche'	");
		add("qud				I	L	Calderón Highland Quichua	");
		add("que	que	que	qu	M	L	Quechua	");
		add("quf				I	L	Lambayeque Quechua	");
		add("qug				I	L	Chimborazo Highland Quichua	");
		add("quh				I	L	South Bolivian Quechua	");
		add("qui				I	L	Quileute	");
		add("quk				I	L	Chachapoyas Quechua	");
		add("qul				I	L	North Bolivian Quechua	");
		add("qum				I	L	Sipacapense	");
		add("qun				I	E	Quinault	");
		add("qup				I	L	Southern Pastaza Quechua	");
		add("quq				I	L	Quinqui	");
		add("qur				I	L	Yanahuanca Pasco Quechua	");
		add("qus				I	L	Santiago del Estero Quichua	");
		add("quv				I	L	Sacapulteco	");
		add("quw				I	L	Tena Lowland Quichua	");
		add("qux				I	L	Yauyos Quechua	");
		add("quy				I	L	Ayacucho Quechua	");
		add("quz				I	L	Cusco Quechua	");
		add("qva				I	L	Ambo-Pasco Quechua	");
		add("qvc				I	L	Cajamarca Quechua	");
		add("qve				I	L	Eastern Apurímac Quechua	");
		add("qvh				I	L	Huamalíes-Dos de Mayo Huánuco Quechua	");
		add("qvi				I	L	Imbabura Highland Quichua	");
		add("qvj				I	L	Loja Highland Quichua	");
		add("qvl				I	L	Cajatambo North Lima Quechua	");
		add("qvm				I	L	Margos-Yarowilca-Lauricocha Quechua	");
		add("qvn				I	L	North Junín Quechua	");
		add("qvo				I	L	Napo Lowland Quechua	");
		add("qvp				I	L	Pacaraos Quechua	");
		add("qvs				I	L	San Martín Quechua	");
		add("qvw				I	L	Huaylla Wanca Quechua	");
		add("qvy				I	L	Queyu	");
		add("qvz				I	L	Northern Pastaza Quichua	");
		add("qwa				I	L	Corongo Ancash Quechua	");
		add("qwc				I	H	Classical Quechua	");
		add("qwh				I	L	Huaylas Ancash Quechua	");
		add("qwm				I	E	Kuman (Russia)	");
		add("qws				I	L	Sihuas Ancash Quechua	");
		add("qwt				I	E	Kwalhioqua-Tlatskanai	");
		add("qxa				I	L	Chiquián Ancash Quechua	");
		add("qxc				I	L	Chincha Quechua	");
		add("qxh				I	L	Panao Huánuco Quechua	");
		add("qxl				I	L	Salasaca Highland Quichua	");
		add("qxn				I	L	Northern Conchucos Ancash Quechua	");
		add("qxo				I	L	Southern Conchucos Ancash Quechua	");
		add("qxp				I	L	Puno Quechua	");
		add("qxq				I	L	Qashqa'i	");
		add("qxr				I	L	Cañar Highland Quichua	");
		add("qxs				I	L	Southern Qiang	");
		add("qxt				I	L	Santa Ana de Tusi Pasco Quechua	");
		add("qxu				I	L	Arequipa-La Unión Quechua	");
		add("qxw				I	L	Jauja Wanca Quechua	");
		add("qya				I	C	Quenya	");
		add("qyp				I	E	Quiripi	");
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