package org.swtk.commons.dict.wordnet.index.name.instance.p.l.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"plecoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02265331\"]}");
	add("{\"term\":\"plecopteran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02265455\"]}");
	add("{\"term\":\"plecotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02151350\"]}");
	add("{\"term\":\"plectania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13051767\"]}");
	add("{\"term\":\"plectognath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02655298\"]}");
	add("{\"term\":\"plectognathi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02654965\"]}");
	add("{\"term\":\"plectomycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13047289\"]}");
	add("{\"term\":\"plectophera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02264714\"]}");
	add("{\"term\":\"plectorrhiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12099097\"]}");
	add("{\"term\":\"plectranthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12883272\"]}");
	add("{\"term\":\"plectron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03935898\"]}");
	add("{\"term\":\"plectrophenax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01541139\"]}");
	add("{\"term\":\"plectrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03935898\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }