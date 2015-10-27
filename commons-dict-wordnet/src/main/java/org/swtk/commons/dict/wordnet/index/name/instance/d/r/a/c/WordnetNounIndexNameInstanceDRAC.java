package org.swtk.commons.dict.wordnet.index.name.instance.d.r.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDRAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dracaena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12500042\"]}");
	add("{\"term\":\"dracaenaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12499571\"]}");
	add("{\"term\":\"dracenaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12499571\"]}");
	add("{\"term\":\"drachm\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13639910\", \"13642471\", \"13744445\"]}");
	add("{\"term\":\"drachma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13697323\", \"13744445\"]}");
	add("{\"term\":\"draco\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01691069\", \"09292623\", \"10962667\"]}");
	add("{\"term\":\"dracocephalum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12866903\"]}");
	add("{\"term\":\"dracontium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11808508\"]}");
	add("{\"term\":\"dracula\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09615446\", \"12080352\"]}");
	add("{\"term\":\"dracunculiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14199533\"]}");
	add("{\"term\":\"dracunculidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01936327\"]}");
	add("{\"term\":\"dracunculus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01936475\", \"11808692\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }