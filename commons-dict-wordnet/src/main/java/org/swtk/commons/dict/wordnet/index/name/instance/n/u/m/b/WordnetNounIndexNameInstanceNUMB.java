package org.swtk.commons.dict.wordnet.index.name.instance.n.u.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNUMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"numbat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01888139\"]}");
	add("{\"term\":\"number\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"03840952\", \"06337519\", \"06609408\", \"05103556\", \"06436708\", \"08497523\", \"06609182\", \"06820056\", \"06437781\", \"06905066\", \"13603216\", \"05128718\"]}");
	add("{\"term\":\"numbering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06502878\"]}");
	add("{\"term\":\"numberplate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03666506\"]}");
	add("{\"term\":\"numbers\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00509558\", \"06444919\"]}");
	add("{\"term\":\"numbfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01498972\"]}");
	add("{\"term\":\"numbness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04643967\", \"14345955\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }