package org.swtk.commons.dict.wiktionary.generated.l.a.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLAI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("laic", "{\"term\":\"laic\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From French \u0027laïque\u0027 from Latin \u0027laicus\u0027 from Ancient greek (to 1453) \u0027λαός\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A layperson, as opposed to a member of the clergy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("laik", "{\"term\":\"laik\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"From Old english (ca. 450-1100) {{m|ang|lāc}}, Proto-germanic {{m|gem-pro|*laiką||game, dance, hymn, sport, fight}} and from Old Norse \u0027leika\u0027 (to move quickly, to play).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"wish, desir\", \"priority\":1}]}, \"synonyms\":{}}");

	add("laicism", "{\"term\":\"laicism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"*{{suffix|laic|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"secularism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("laisse", "{\"term\":\"laisse\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|laisse|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A section of verse concerning a single theme; tirade\", \"priority\":1}]}, \"synonyms\":{}}");

	add("laity", "{\"term\":\"laity\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Anglo-norman \u0027laite\u0027 from Latin \u0027laitas\u0027 () from Ancient greek (to 1453) \u0027λαός\u0027 (lang\u003dgrc) {suffix|lay|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"people of a church who are not ordained clergy or clerics\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"the common man or woma\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the unlearned, untrained or ignorant as in “The Layman’s Guide to Basket Weaving”\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }