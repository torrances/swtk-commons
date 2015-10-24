package org.swtk.commons.dict.wiktionary.generated.a.b.j;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryABJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("abjection", "{\"term\":\"abjection\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"middle french (ca. 1400-1600)\"], \"text\":\"From Middle english (1100-1500) \u0027abjeccioun\u0027 from \u0027\u0027either\u0027\u0027 Middle french (ca. 1400-1600) \u0027abjection\u0027 \u0027\u0027or\u0027\u0027 \u0027abjection-\u0027 {{m|la|abiectiō}}, from \u0027abjectus\u0027 (cast down) \u0026lt;ref name\u003dWI3\u0026gt;{{R:MW3 1976|page\u003d4}}\u0026lt;/ref\u0026gt;\u0026lt;ref name\u003dSOED\u0026gt;{{R:SOED5|page\u003d5}}\u0026lt;/ref\u0026gt;* See abject.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A low or downcast condition; meanness of spirit; abasement; degradation. \u0026lt;ref name\u003dSOED/\u0026gt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027An \u0027\u0027abjection\u0027\u0027 from the beatific regions where God, and his angels and saints, dwell forever.\u0027\u0026quot\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Something cast off; garbage. \u0026lt;ref name\u003dSOED/\u0026gt\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The act of bringing down or humbling; casting down. \u0026lt;ref name\u003dSOED/\u0026gt\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027The \u0027\u0027abjection\u0027\u0027 of the king and his realm.\u0027\u0026quot\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The act of casting off; rejection. \u0026lt;ref name\u003dSOED/\u0026gt\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The act of dispersing or casting off spores\", \"priority\":7}]}, \"synonyms\":{}}");

	add("abjectness", "{\"term\":\"abjectness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|abject|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being abject; abasement; meanness; servility. \u0026lt;ref name\u003dSOED\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("abjuration", "{\"term\":\"abjuration\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"Latin\"], \"text\":\"First attested around 1439. From Middle english (1100-1500) \u0027abjuracioun\u0027 from Latin {{m|la|abiūrātiō||forswearing, abjuration}}, from \u0027ab\u0027 (from, away from) + {{m|la|iūrō||swear or take an oath}}, from {{m|la|iūs||law, right, duty}}. Compare French \u0027abjuratio. French|abjuration\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A solemn recantation or renunciation on oath; as, an \u0027\u0027abjuration\u0027\u0027 of heresy. \u0026lt;ref name\u003dSOED\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A repudiation on oath of a religious or political principle. \u0026lt;ref name\u003dSOED/\u0026gt\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The act of abjuring\", \"priority\":3}]}, \"synonyms\":{}}");

	add("abjurer", "{\"term\":\"abjurer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|abjure|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who abjures. \u0026lt;ref name\u003dSOED\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }