package org.swtk.commons.dict.wordnet.indexbyname.instance.p.i.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePIA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12496279\"]}");
	add("{\"term\":\"piaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11254142\"]}");
	add("{\"term\":\"piaffe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00289228\"]}");
	add("{\"term\":\"piaget\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11254282\"]}");
	add("{\"term\":\"pianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06906104\"]}");
	add("{\"term\":\"pianissimo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04998511\"]}");
	add("{\"term\":\"pianist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10450429\"]}");
	add("{\"term\":\"piano\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04998511\", \"03934354\"]}");
	add("{\"term\":\"pianoforte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03934354\"]}");
	add("{\"term\":\"pianola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03743557\"]}");
	add("{\"term\":\"piaster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13709383\", \"13716265\"]}");
	add("{\"term\":\"piastre\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13709383\", \"13716265\"]}");
	add("{\"term\":\"piazza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08637370\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }