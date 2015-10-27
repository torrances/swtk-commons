package org.swtk.commons.dict.wordnet.index.name.instance.m.a.r.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMARG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"margarin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07688659\", \"15104012\"]}");
	add("{\"term\":\"margarine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07688659\"]}");
	add("{\"term\":\"margarita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07932158\"]}");
	add("{\"term\":\"margasivsa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15245660\"]}");
	add("{\"term\":\"margate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02591424\"]}");
	add("{\"term\":\"margay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02129292\"]}");
	add("{\"term\":\"marge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07688659\"]}");
	add("{\"term\":\"margin\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04757264\", \"06401041\", \"13281661\", \"13372293\", \"05127983\", \"13926393\"]}");
	add("{\"term\":\"marginalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06517926\"]}");
	add("{\"term\":\"marginalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13532149\"]}");
	add("{\"term\":\"marginality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05085354\"]}");
	add("{\"term\":\"marginalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13532149\"]}");
	add("{\"term\":\"marginocephalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01705264\"]}");
	add("{\"term\":\"marginocephalian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01705264\"]}");
	add("{\"term\":\"margosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12717253\"]}");
	add("{\"term\":\"margrave\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10313522\", \"10313681\"]}");
	add("{\"term\":\"marguerite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11946367\", \"12010338\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }