package org.swtk.commons.dict.wordnet.index.name.instance.s.t.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTEM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stem\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00442441\", \"02883250\", \"04320909\", \"04191138\", \"13149924\", \"06311183\"]}");
	add("{\"term\":\"stemma\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05319831\", \"08118903\", \"13935555\"]}");
	add("{\"term\":\"stemmatics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06181366\"]}");
	add("{\"term\":\"stemmatology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06181366\"]}");
	add("{\"term\":\"stemmer\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04321005\", \"04321124\", \"05856280\", \"10673342\", \"10684095\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }