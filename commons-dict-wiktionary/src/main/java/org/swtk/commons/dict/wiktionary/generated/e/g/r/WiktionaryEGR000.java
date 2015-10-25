package org.swtk.commons.dict.wiktionary.generated.e.g.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEGR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("egret", "{\"term\":\"egret\", \"etymology\":{\"influencers\":[{},{},{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"frankish\", \"old french (842-ca. 1400)\", \"old high german (ca. 750-1050)\", \"old provençal (to 1500)\", \"anglo-norman\"], \"text\":\"From Middle english (1100-1500) from Anglo-norman \u0027egret\u0027 () Old french (842-ca. 1400) \u0027aigrette\u0027 (egret) from Old provençal (to 1500) \u0027aigreta\u0027 diminutive of \u0027aigron\u0027 (heron) from Frankish {{m|frk|*haigro||heron}}. Cognate with Old high german (ca. 750-1050) \u0027heigaro\u0027 (heron) Old english (ca. 450-1100) {{m|ang|hrāgra||heron}}. More at {{l|en|heron}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various wading birds of the genera \u0027Egretta\u0027 or \u0027Ardea\u0027 that includes herons, many of which are white or buff, and several of which develop fine plumes during the breeding season\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A plume or tuft of feathers worn as a part of a headdress, or anything imitating such an ornament; an aigrette\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The flying feathery or hairy crown of seeds or achenes, such as the down of the thistle\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The crab-eating macaque (\u0027Macaca fascicularis\", \"priority\":4}]}, \"synonyms\":{}}");

	add("egregor", "{\"term\":\"egregor\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\"], \"text\":\"From French {{m|fr|égrégore||spirit of a group}},\u0026lt;ref\u0026gt;Victor Hugo, [http://fr.wikisource.org/wiki/Le_Jour_des_rois \u0026quot;Le jour des rois\u0026quot;], \u0027La Légende des Siècles\u0027 IV, V, and [http://fr.wikisource.org/wiki/L%E2%80%99Italie_-_Ratbert \u0026quot;L\u0027Italie – Ratbert\u0026quot;], \u0027La Légende des Siècles\u0027 VII. Both in the Première Série, 1859.\u0026lt;/ref\u0026gt; from the Ancient greek (to 1453) substantive of {{m|grc|ἐγρήγορος||wakeful|sc\u003dpolytonic}} meaning {{m|en|watcher}}, {{m|en|angel}} in the Book of Enoch.\u0026lt;ref\u0026gt;Eliphas Lévi, \u0026quot;The Great Mystery\u0026quot; (1868) p.127-130, 133, 136\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an angelic being from the Book of Enoc\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"an autonomous psychic entity composed of and influencing the thoughts of a group of people\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }