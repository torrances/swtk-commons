package org.swtk.commons.dict.wiktionary.generated.e.g.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEGY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("egypt", "{\"term\":\"egypt\", \"etymology\":{\"influencers\":[], \"languages\":[\"egyptian (ancient)\", \"English\", \"middle french (ca. 1400-1600)\", \"mycenaean greek\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027egypte\u0027 from Latin \u0027aegyptus\u0027 from Ancient greek (to 1453) \u0027αἴγυπτος\u0027 from Mycenaean greek {{m|gmy|sc\u003dLatn|*aikupitos}} (see also \u0027𐁁𐀓𐀠𐀴𐀍|tr\u003daikupitijo\u0027 (egyptian) , from Late Egyptian (ancient) \u0027\u0027 (hikuptah) from Middle Egyptian (ancient) \u0027ḥwt k3 ptḥ\u0027 (literally, \u0027The temple of the {{l|en|ka}} of Ptah\u0027, referring to Ptah\u0027s temple in the important city of Memphis).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A country in North Africa. Official name: Arab Republic of Egypt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A civilization based around the river Nile, on its lower reaches nearer the Mediterranean\", \"priority\":2}]}, \"synonyms\":{}}");

	add("egyptiac", "{\"term\":\"egyptiac\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From the {{m|la|Aegyptiacus||Egyptian}}, from the Ancient greek (to 1453) {{m|grc|Αἰγῠπτῐᾰκός||of or for the Egyptians}}, from {{suffix|nocat\u003dyes|Αἰγῠ́πτῐος|ᾰκός|t1\u003dEgyptian|lang\u003dgrc}}. Equivalent to Latin {{suffix|nocat\u003dyes|Aegyptius|acus|t1\u003dEgyptian|lang\u003dla}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a mixture of vinegar, honey, verdigris and sometimes burnt alum formerly used as a detergent, Egyptian ointment\", \"priority\":1}]}, \"synonyms\":{}}");

	add("egyptology", "{\"term\":\"egyptology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Egypt|logy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of ancient Egypt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A work concerning ancient Egypt\", \"priority\":2}]}, \"synonyms\":{}}");

	add("egyptomania", "{\"term\":\"egyptomania\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{affix|en|Egypt|-o-|-mania}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Obsessive interest by Westerners in ancient Egyptian culture, especially during the 19th century\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }