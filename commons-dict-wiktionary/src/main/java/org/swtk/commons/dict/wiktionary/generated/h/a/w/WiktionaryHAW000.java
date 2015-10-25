package org.swtk.commons.dict.wiktionary.generated.h.a.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHAW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hawaiite", "{\"term\":\"hawaiite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Hawaii|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An olivine basalt intermediate between alkali olivine and mugearite\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A gem variety of olivine peridot\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hawala", "{\"term\":\"hawala\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027حَوَالَة\u0027 (transfer, trust)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A long-established informal system of money transfer from India and the Middle East, still in use by migrant workers\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hawick", "{\"term\":\"hawick\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"scots\"], \"text\":\"From w:Early Scots|Early Scots \u0027havwic\u0027 perhaps ultimately from Old english (ca. 450-1100) \u0027haga wīċ\u0027 (village surrounded by a hedge)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A town in the w:Scottish Scottish Borders region\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hawknose", "{\"term\":\"hawknose\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|hawk|nose|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A nose shaped like a hawk\u0027s beak\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hawkweed", "{\"term\":\"hawkweed\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|hawk|weed|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any species of plant of the genus and its segregate genus , in the sunflower family (Asteraceae\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hawse", "{\"term\":\"hawse\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The part of the bow containing the hawseholes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A hawsehole or hawsepipe\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The horizontal distance or area between an anchored vessel\u0027s bows and the actual position of her anchor(s\", \"priority\":3}]}, \"synonyms\":{}}");

	add("hawser", "{\"term\":\"hawser\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Anglo-norman \u0027haucer\u0027 from Old french (842-ca. 1400) \u0027haucier\u0027 \u0027halcier\u0027 from \u0027*helciaria\u0027 from Latin \u0027helcium\u0027 (collar harness) Altered in English on mistaken association with hawse and perhaps haul. Compare French \u0027aussière\u0027 \u0027haussière\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a cable or heavy rope used to tow or moor a shi\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1883:\u0027\u0027 w:Robert Louis Robert Louis Stevenson, \u0027w:Treasure Treasure Island\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027hawser\u0027\u0027 was as taut as a bowstring - so strong she pulled upon her anchor\", \"priority\":3}]}, \"synonyms\":{}}");

	add("hawthorn", "{\"term\":\"hawthorn\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"From Old english (ca. 450-1100) \u0027hagaþorn\u0027 () \u0027hæguþorn\u0027 () from \u0027haga\u0027 (lang\u003dang) + \u0027þorn\u0027 (lang\u003dang) from Proto-germanic \u0027*haguþurnuz\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various shrubs and small trees of the genus \u0027Crataegus\u0027 having small, apple-like fruits and thorny branches\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hawthorne", "{\"term\":\"hawthorne\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"for someone who lived near a hawthorn hedge or in a place with such a name\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hawthorneite", "{\"term\":\"hawthorneite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Hawthorne|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hexagonal-dihexagonal dipyramidal light gray mineral containing barium, chromium, iron, magnesium, oxygen, and titanium\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }