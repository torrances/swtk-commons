package org.swtk.commons.dict.wordnet.index.name.instance.g.e.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGERM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"germ\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01387132\", \"05237135\", \"05843082\"]}");
	add("{\"term\":\"german\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06963290\", \"09767053\"]}");
	add("{\"term\":\"germander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12890238\"]}");
	add("{\"term\":\"germaneness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13817254\"]}");
	add("{\"term\":\"germanic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06959259\"]}");
	add("{\"term\":\"germanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00415084\"]}");
	add("{\"term\":\"germanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10147791\"]}");
	add("{\"term\":\"germanite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14700769\"]}");
	add("{\"term\":\"germanium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14662695\"]}");
	add("{\"term\":\"germany\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08784821\"]}");
	add("{\"term\":\"germicide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03212950\"]}");
	add("{\"term\":\"germinal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15201984\"]}");
	add("{\"term\":\"germination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07338835\", \"13508410\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }