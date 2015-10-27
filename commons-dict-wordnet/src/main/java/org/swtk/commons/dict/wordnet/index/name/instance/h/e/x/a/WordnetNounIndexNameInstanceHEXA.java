package org.swtk.commons.dict.wordnet.index.name.instance.h.e.x.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHEXA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hexachlorophene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03522434\"]}");
	add("{\"term\":\"hexad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13766862\"]}");
	add("{\"term\":\"hexadrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14777987\"]}");
	add("{\"term\":\"hexagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13904933\"]}");
	add("{\"term\":\"hexagram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13903468\"]}");
	add("{\"term\":\"hexagrammidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02651086\"]}");
	add("{\"term\":\"hexagrammos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02651399\"]}");
	add("{\"term\":\"hexahedron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13938338\"]}");
	add("{\"term\":\"hexalectris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12089325\"]}");
	add("{\"term\":\"hexameter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07110903\"]}");
	add("{\"term\":\"hexamita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01422805\"]}");
	add("{\"term\":\"hexanchidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01485395\"]}");
	add("{\"term\":\"hexanchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01485528\"]}");
	add("{\"term\":\"hexane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14931273\"]}");
	add("{\"term\":\"hexapod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02159858\"]}");
	add("{\"term\":\"hexapoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02161923\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }