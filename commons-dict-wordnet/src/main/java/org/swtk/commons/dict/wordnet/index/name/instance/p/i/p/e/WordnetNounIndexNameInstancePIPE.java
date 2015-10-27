package org.swtk.commons.dict.wordnet.index.name.instance.p.i.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePIPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pipe\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03860335\", \"03951891\", \"13924014\", \"03950948\", \"03951443\"]}");
	add("{\"term\":\"pipeclay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14837730\"]}");
	add("{\"term\":\"pipefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01458419\"]}");
	add("{\"term\":\"pipefitting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03952438\"]}");
	add("{\"term\":\"pipeful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13790770\"]}");
	add("{\"term\":\"pipeline\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03952601\", \"07238295\"]}");
	add("{\"term\":\"piper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13169822\", \"10454808\"]}");
	add("{\"term\":\"piperaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13169574\"]}");
	add("{\"term\":\"piperacillin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03952808\"]}");
	add("{\"term\":\"piperales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13169385\"]}");
	add("{\"term\":\"piperazine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03953090\"]}");
	add("{\"term\":\"piperin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15057756\"]}");
	add("{\"term\":\"piperine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15057756\"]}");
	add("{\"term\":\"piperocaine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03953209\"]}");
	add("{\"term\":\"pipet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03953387\"]}");
	add("{\"term\":\"pipette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03953387\"]}");
	add("{\"term\":\"pipework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03860335\"]}");
	add("{\"term\":\"pipewort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12630140\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }