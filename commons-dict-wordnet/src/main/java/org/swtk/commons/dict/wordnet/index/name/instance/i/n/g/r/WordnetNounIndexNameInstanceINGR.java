package org.swtk.commons.dict.wordnet.index.name.instance.i.n.g.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINGR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ingraining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00890760\"]}");
	add("{\"term\":\"ingrate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10226382\"]}");
	add("{\"term\":\"ingratiation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00160893\"]}");
	add("{\"term\":\"ingratitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07519950\"]}");
	add("{\"term\":\"ingredient\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07825072\", \"05877576\", \"03575860\"]}");
	add("{\"term\":\"ingres\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11091828\"]}");
	add("{\"term\":\"ingress\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00049744\", \"07336941\"]}");
	add("{\"term\":\"ingrian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06971262\", \"09725944\"]}");
	add("{\"term\":\"ingroup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08257554\"]}");
	add("{\"term\":\"ingrowth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09336065\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }