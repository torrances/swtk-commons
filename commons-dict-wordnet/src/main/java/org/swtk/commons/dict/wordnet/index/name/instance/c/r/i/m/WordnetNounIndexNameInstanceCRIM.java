package org.swtk.commons.dict.wordnet.index.name.instance.c.r.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"crime\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00768966\", \"00767761\"]}");
	add("{\"term\":\"crimea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09037830\"]}");
	add("{\"term\":\"criminal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09997190\"]}");
	add("{\"term\":\"criminalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01128280\"]}");
	add("{\"term\":\"criminalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14014831\"]}");
	add("{\"term\":\"criminality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14014831\"]}");
	add("{\"term\":\"criminalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01128280\"]}");
	add("{\"term\":\"criminalness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14014831\"]}");
	add("{\"term\":\"criminologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09997972\"]}");
	add("{\"term\":\"criminology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06161412\"]}");
	add("{\"term\":\"crimp\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05265782\", \"09998096\", \"13930429\"]}");
	add("{\"term\":\"crimper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03154898\", \"09998096\"]}");
	add("{\"term\":\"crimson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04970765\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }