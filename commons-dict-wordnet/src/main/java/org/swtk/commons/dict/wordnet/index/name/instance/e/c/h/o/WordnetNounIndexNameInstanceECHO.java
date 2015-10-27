package org.swtk.commons.dict.wordnet.index.name.instance.e.c.h.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceECHO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"echo\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"01023061\", \"04753847\", \"05018346\", \"07214950\", \"09572176\", \"05017985\"]}");
	add("{\"term\":\"echocardiogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07017051\"]}");
	add("{\"term\":\"echocardiograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03268669\"]}");
	add("{\"term\":\"echocardiography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00833967\"]}");
	add("{\"term\":\"echoencephalogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07016923\"]}");
	add("{\"term\":\"echoencephalograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03268799\"]}");
	add("{\"term\":\"echoencephalography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00834132\"]}");
	add("{\"term\":\"echogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04267474\"]}");
	add("{\"term\":\"echography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00903487\"]}");
	add("{\"term\":\"echolalia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01020893\", \"07215081\"]}");
	add("{\"term\":\"echolocation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00156617\"]}");
	add("{\"term\":\"echovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01340974\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }