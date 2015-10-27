package org.swtk.commons.dict.wordnet.index.name.instance.f.u.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFUND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fund\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08087686\", \"13388243\", \"13379722\"]}");
	add("{\"term\":\"fundament\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03391862\", \"05566889\", \"05801562\"]}");
	add("{\"term\":\"fundamental\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05727905\", \"07342658\"]}");
	add("{\"term\":\"fundamentalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06226161\", \"06241447\"]}");
	add("{\"term\":\"fundamentalist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10136027\", \"11428554\"]}");
	add("{\"term\":\"fundamentals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05879984\"]}");
	add("{\"term\":\"funding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01101014\", \"13386871\"]}");
	add("{\"term\":\"fundraiser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07470250\", \"10136135\"]}");
	add("{\"term\":\"funds\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13377127\"]}");
	add("{\"term\":\"fundulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01449642\"]}");
	add("{\"term\":\"fundus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05272044\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }