package org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"citadel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02809273\"]}");
	add("{\"term\":\"citation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02386978\", \"06570268\", \"06625409\", \"06776392\", \"07195230\", \"06718888\"]}");
	add("{\"term\":\"cite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06776392\"]}");
	add("{\"term\":\"citellus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02360393\"]}");
	add("{\"term\":\"citharichthys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02664711\"]}");
	add("{\"term\":\"cither\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03039817\", \"04622583\"]}");
	add("{\"term\":\"cithern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03039817\"]}");
	add("{\"term\":\"citizen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09943131\"]}");
	add("{\"term\":\"citizenry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08177175\"]}");
	add("{\"term\":\"citizenship\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04905385\", \"13976685\"]}");
	add("{\"term\":\"citlaltepetl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09196674\"]}");
	add("{\"term\":\"citole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03039817\"]}");
	add("{\"term\":\"citrange\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07766275\", \"12733080\"]}");
	add("{\"term\":\"citrate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14628362\"]}");
	add("{\"term\":\"citrin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15117704\"]}");
	add("{\"term\":\"citrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14837237\"]}");
	add("{\"term\":\"citron\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12730109\", \"07766425\"]}");
	add("{\"term\":\"citroncirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12732909\"]}");
	add("{\"term\":\"citronwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11663957\", \"12730351\"]}");
	add("{\"term\":\"citrulline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14628464\"]}");
	add("{\"term\":\"citrullus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12184166\"]}");
	add("{\"term\":\"citrus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12728541\", \"07763031\"]}");
	add("{\"term\":\"cittern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03039817\"]}");
	add("{\"term\":\"city\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08243256\", \"08558466\", \"08542298\"]}");
	add("{\"term\":\"cityscape\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03040134\", \"06219505\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }