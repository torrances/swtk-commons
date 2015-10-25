package org.swtk.commons.dict.wiktionary.generated.l.y.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLYC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lycanthrope", "{\"term\":\"lycanthrope\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027λυκάνθρωπος\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A werewolf\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A human with a curse that causes involuntary shapeshifting\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lycanthropy", "{\"term\":\"lycanthropy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027λυκανθρωπία\u0027 from \u0027λυκάνθρωπος\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of shapeshifting between the form of a human being and an animal (usually a wolf), often done during a full moon, according to legend\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A delusion in which one believes oneself to be a wolf or other wild animal\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lyceum", "{\"term\":\"lyceum\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027λύκειον\u0027 (the name of a gymnasium, or athletic training facility, near Athens where Aristotle established his school), from Λύκειος (\u0026quot;Lycian\u0026quot; or \u0026quot;wolf-killer\u0026quot;).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A public hall designed for lectures or concerts\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A school at a stage between elementary school and college\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lychee", "{\"term\":\"lychee\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"yue chinese\"], \"text\":\"From Yue chinese 荔枝 (Jyutping: lai\u0026lt;sup\u0026gt;6\u0026lt;/sup\u0026gt;zi\u0026lt;sup\u0026gt;1\u0026lt;/sup\u0026gt;).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Chinese tropical fruit tree \u0027Litchi chinensis\u0027, of the soapberry family\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"That tree\u0027s bright red oval fruit with a single stone surrounded by a fleshy white aril\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lycia", "{\"term\":\"lycia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027lycia\u0027 from Ancient greek (to 1453) {{m|grc|Λυκία}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An ancient region and Roman province in the southwest of Asia Minor, between Caria and Pamphylia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lycian", "{\"term\":\"lycian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|Lycia|an|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An extinct Indo-European language in the Anatolian group\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lycopene", "{\"term\":\"lycopene\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A red carotenoid pigment found in tomatoes, other red vegetables, and in animal tissue; there is some evidence that it may lower the risk of prostate right|300px\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lycophobia", "{\"term\":\"lycophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|lyco|phobia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Fear of wolves\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lycra", "{\"term\":\"lycra\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"spande\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }