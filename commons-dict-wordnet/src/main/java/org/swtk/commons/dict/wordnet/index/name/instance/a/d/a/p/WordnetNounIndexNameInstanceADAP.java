package org.swtk.commons.dict.wordnet.index.name.instance.a.d.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"adapa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09538266\"]}");
	add("{\"term\":\"adapid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02498841\"]}");
	add("{\"term\":\"adapin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03234608\"]}");
	add("{\"term\":\"adaptability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04666447\"]}");
	add("{\"term\":\"adaptation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00194255\", \"13448251\", \"06420422\"]}");
	add("{\"term\":\"adapter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02681751\", \"09829330\"]}");
	add("{\"term\":\"adaption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13448251\"]}");
	add("{\"term\":\"adaptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02681751\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }