package org.swtk.commons.dict.wordnet.index.name.instance.c.a.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCALO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"calocarpum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12794094\"]}");
	add("{\"term\":\"calocedrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11654977\"]}");
	add("{\"term\":\"calochortus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12466353\"]}");
	add("{\"term\":\"calomel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14975076\"]}");
	add("{\"term\":\"caloocan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09004292\"]}");
	add("{\"term\":\"caloosahatchee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09254268\"]}");
	add("{\"term\":\"calophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12384896\"]}");
	add("{\"term\":\"calopogon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12069603\"]}");
	add("{\"term\":\"calorie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13748406\", \"13748672\"]}");
	add("{\"term\":\"calorimeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02944550\"]}");
	add("{\"term\":\"calorimetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01003756\"]}");
	add("{\"term\":\"calosoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02170472\"]}");
	add("{\"term\":\"calostomataceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13062485\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }