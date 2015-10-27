package org.swtk.commons.dict.wordnet.index.name.instance.s.p.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spoof\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06793148\"]}");
	add("{\"term\":\"spook\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05906778\", \"09996447\"]}");
	add("{\"term\":\"spool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02863755\"]}");
	add("{\"term\":\"spoon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04291479\", \"13792309\", \"04291140\"]}");
	add("{\"term\":\"spoonbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02009310\"]}");
	add("{\"term\":\"spoondrift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15081394\"]}");
	add("{\"term\":\"spoonerism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06782955\"]}");
	add("{\"term\":\"spoonfeeding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00894391\", \"01061113\"]}");
	add("{\"term\":\"spoonflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11813872\"]}");
	add("{\"term\":\"spoonful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13792309\"]}");
	add("{\"term\":\"spoor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09466185\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }