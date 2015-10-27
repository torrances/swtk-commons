package org.swtk.commons.dict.wordnet.index.name.instance.p.i.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePICA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pica\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01584752\", \"13734533\", \"14079459\"]}");
	add("{\"term\":\"picador\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09856174\"]}");
	add("{\"term\":\"picaninny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10451094\"]}");
	add("{\"term\":\"picardie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08963862\"]}");
	add("{\"term\":\"picardy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08963862\"]}");
	add("{\"term\":\"picariae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01828399\"]}");
	add("{\"term\":\"picasso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11254941\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }