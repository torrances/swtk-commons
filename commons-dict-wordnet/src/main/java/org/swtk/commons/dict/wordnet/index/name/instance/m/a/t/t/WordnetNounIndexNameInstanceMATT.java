package org.swtk.commons.dict.wordnet.index.name.instance.m.a.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMATT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"matt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04963287\"]}");
	add("{\"term\":\"matte\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04963287\", \"14973523\"]}");
	add("{\"term\":\"matter\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06376912\", \"05176769\", \"05696202\", \"00021007\", \"05822417\", \"05679169\"]}");
	add("{\"term\":\"matterhorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09372089\"]}");
	add("{\"term\":\"matteuccia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13218698\"]}");
	add("{\"term\":\"matthew\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06453277\", \"11184661\"]}");
	add("{\"term\":\"matthiola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11912929\"]}");
	add("{\"term\":\"matting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03733809\", \"03736384\"]}");
	add("{\"term\":\"mattock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03736510\"]}");
	add("{\"term\":\"mattole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06932688\", \"09680229\"]}");
	add("{\"term\":\"mattress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03736655\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }