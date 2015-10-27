package org.swtk.commons.dict.wordnet.index.name.instance.x.e.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceXERO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"xerobates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01673953\"]}");
	add("{\"term\":\"xeroderma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14561165\"]}");
	add("{\"term\":\"xerodermia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14561165\"]}");
	add("{\"term\":\"xerography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00906602\"]}");
	add("{\"term\":\"xeroma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14561715\"]}");
	add("{\"term\":\"xerophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13141863\"]}");
	add("{\"term\":\"xerophthalmia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14561715\"]}");
	add("{\"term\":\"xerophthalmus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14561715\"]}");
	add("{\"term\":\"xerophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12485826\"]}");
	add("{\"term\":\"xerophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13141863\"]}");
	add("{\"term\":\"xeroradiography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00906890\"]}");
	add("{\"term\":\"xerostomia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14561931\"]}");
	add("{\"term\":\"xerotes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14560040\"]}");
	add("{\"term\":\"xerox\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04616281\", \"04616593\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }