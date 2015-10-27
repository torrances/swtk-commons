package org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRIV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"privacy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14439493\", \"04630289\"]}");
	add("{\"term\":\"private\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10496052\"]}");
	add("{\"term\":\"privateer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04012443\", \"10496513\"]}");
	add("{\"term\":\"privateersman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10496513\"]}");
	add("{\"term\":\"privateness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04630289\", \"14439493\"]}");
	add("{\"term\":\"privates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05521732\"]}");
	add("{\"term\":\"privation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01152695\", \"14517010\"]}");
	add("{\"term\":\"privatisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01154528\"]}");
	add("{\"term\":\"privatization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01154528\"]}");
	add("{\"term\":\"privet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12328273\"]}");
	add("{\"term\":\"privilege\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05187094\", \"05186242\", \"05165679\"]}");
	add("{\"term\":\"privine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03812592\"]}");
	add("{\"term\":\"privy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03865924\", \"04453410\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }