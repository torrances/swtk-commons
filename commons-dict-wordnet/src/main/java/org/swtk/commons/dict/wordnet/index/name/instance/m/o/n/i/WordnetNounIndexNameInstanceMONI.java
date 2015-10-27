package org.swtk.commons.dict.wordnet.index.name.instance.m.o.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMONI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"moniker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06349063\"]}");
	add("{\"term\":\"monilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13099833\"]}");
	add("{\"term\":\"moniliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13098893\"]}");
	add("{\"term\":\"moniliales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13098239\"]}");
	add("{\"term\":\"moniliasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14205195\"]}");
	add("{\"term\":\"monism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05973510\"]}");
	add("{\"term\":\"monistat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03764249\"]}");
	add("{\"term\":\"monition\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06570425\", \"06685042\", \"06727359\"]}");
	add("{\"term\":\"monitor\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"01697350\", \"03787320\", \"03787539\", \"03787723\", \"03787963\", \"09791278\", \"10498545\"]}");
	add("{\"term\":\"monitoring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00881724\"]}");
	add("{\"term\":\"monitrice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10260721\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }