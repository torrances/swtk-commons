package org.swtk.commons.dict.wordnet.index.name.instance.h.y.p.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHYPN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hypnagogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14937895\"]}");
	add("{\"term\":\"hypnoanalysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00706572\"]}");
	add("{\"term\":\"hypnogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00239645\"]}");
	add("{\"term\":\"hypnopedia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00894218\"]}");
	add("{\"term\":\"hypnophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14407164\"]}");
	add("{\"term\":\"hypnos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09519804\"]}");
	add("{\"term\":\"hypnosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14050074\"]}");
	add("{\"term\":\"hypnotherapy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00705317\"]}");
	add("{\"term\":\"hypnotic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04268044\"]}");
	add("{\"term\":\"hypnotiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10214880\"]}");
	add("{\"term\":\"hypnotism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00159816\"]}");
	add("{\"term\":\"hypnotist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10214880\"]}");
	add("{\"term\":\"hypnotizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10214880\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }