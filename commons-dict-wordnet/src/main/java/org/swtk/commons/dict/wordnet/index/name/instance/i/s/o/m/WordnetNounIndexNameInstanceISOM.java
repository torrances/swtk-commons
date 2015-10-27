package org.swtk.commons.dict.wordnet.index.name.instance.i.s.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceISOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"isomer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14948326\"]}");
	add("{\"term\":\"isomerase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14948497\"]}");
	add("{\"term\":\"isomerisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07430707\"]}");
	add("{\"term\":\"isomerism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13962767\"]}");
	add("{\"term\":\"isomerization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07430707\"]}");
	add("{\"term\":\"isometric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06814598\"]}");
	add("{\"term\":\"isometrics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00629089\"]}");
	add("{\"term\":\"isometropia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14579280\"]}");
	add("{\"term\":\"isometry\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04755894\", \"05138802\", \"13808399\", \"15303946\"]}");
	add("{\"term\":\"isomorphism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04751885\"]}");
	add("{\"term\":\"isomorphy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04751885\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }