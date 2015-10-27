package org.swtk.commons.dict.wordnet.index.name.instance.g.i.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGING {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ginger\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04642190\", \"07830901\", \"07831139\", \"12376277\"]}");
	add("{\"term\":\"gingerbread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07648755\"]}");
	add("{\"term\":\"gingerol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15057630\"]}");
	add("{\"term\":\"gingerroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07830901\"]}");
	add("{\"term\":\"gingersnap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07651993\"]}");
	add("{\"term\":\"gingham\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442651\"]}");
	add("{\"term\":\"gingiva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05312431\"]}");
	add("{\"term\":\"gingivitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14104698\"]}");
	add("{\"term\":\"gingko\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11684869\"]}");
	add("{\"term\":\"ginglymostoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01489347\"]}");
	add("{\"term\":\"ginglymus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05588047\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }