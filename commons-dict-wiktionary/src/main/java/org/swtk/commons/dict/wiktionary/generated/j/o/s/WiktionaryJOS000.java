package org.swtk.commons.dict.wiktionary.generated.j.o.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJOS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("josei", "{\"term\":\"josei\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a class of manga written for an older female audience\", \"priority\":1}]}, \"synonyms\":{}}");

	add("joseph", "{\"term\":\"joseph\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Probably in allusion to w:Joseph|Joseph\u0027s coat of many colours in s:Bible (King James)/Genesi. Chapter 37|Genesis 37:3.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woman\u0027s riding habit worn in the 18th century with a long cape and buttons running down the front\", \"priority\":1}]}, \"synonyms\":{}}");

	add("josephite", "{\"term\":\"josephite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Joseph|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the Russian followers of hegumen Joseph Volotsky, who advocated the church\u0027s ownership of land, social activity and charity\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A member of a twentieth-century movement in the Russian Orthodox Church, followers of Metropolitan Joseph (Petrovykh\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A member of Josephites-CJ, a Roman Catholic religious order founded in Belgium\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A member of St. Joseph\u0027s Missionary Society\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A member of the Josephite Fathers, a Roman Catholic religious order originally established to minister to African Americans, headquartered in Baltimore, Maryland, USA\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A Latter Day Saint adherent tracing Restorationist priesthood lineage through Joseph Smith III, son of the movement\u0027s founder\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A member of the Congregation of Sisters of St. Joseph of the Sacred Heart\", \"priority\":7}]}, \"synonyms\":{}}");

	add("joskin", "{\"term\":\"joskin\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[], \"text\":\"After \u0027bumpkin\u0027 (yokel) \u0026amp;mdash; \u0027dialect\u0027 \u0027joss\u0027 (bump)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a yokel, country bumpki\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1854\u0027\u0027, Dickens, \u0027Hard Times\u0027, Part 3, Chapter 7\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"‘But look at him,’ groaned Mr. Gradgrind. ‘Will any coach—\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"‘I don’t mean that he thould go in the comic livery,’ said Sleary. ‘Thay the word, and I’ll make a \u0027\u0027Jothkin\u0027\u0027 of him, out of the wardrobe, in five minutes\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"‘I don’t understand,’ said Mr. Gradgrind\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"‘A \u0027\u0027Jothkin\u0027\u0027—a Carter. Make up your mind quick, Thquire. There’ll be beer to feth. I’ve never met with nothing but beer ath’ll ever clean a comic blackamoor\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, Stephen Wakelam. (BBC, \u0027Journal of a Joskin\u0027 - a dramatisation of the diaries of Fred Kitchen\", \"priority\":7}]}, \"synonyms\":{}}");

	add("jostler", "{\"term\":\"jostler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jostle|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who jostles\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }