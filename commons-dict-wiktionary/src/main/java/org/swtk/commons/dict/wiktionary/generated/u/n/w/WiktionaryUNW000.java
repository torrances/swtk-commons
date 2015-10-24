package org.swtk.commons.dict.wiktionary.generated.u.n.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUNW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("unwarrantableness", "{\"term\":\"unwarrantableness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|unwarrantable|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being unwarrantable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unwedding", "{\"term\":\"unwedding\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|wedding|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A gathering or ceremony that marks or celebrates the end of a marriage\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unwellness", "{\"term\":\"unwellness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or characteristic of being unwell; a feeling of slight to moderate sickliness\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1887\u0027\u0027, w:Charles Charles Darwin, \u0027The Autobiography of Charles Darwin\u0027, ch. 5\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"During the three years and eight months whilst we resided in London, I did less scientific work, though I worked as hard as I possibly could, than during any other equal length of time in my life. This was owing to frequently recurring \u0027\u0027unwellness\u0027\u0027, and to one long and serious illness\", \"priority\":3}]}, \"synonyms\":{}}");

	add("unwit", "{\"term\":\"unwit\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|wit|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lack of wit or understanding; ignorance\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unwomanliness", "{\"term\":\"unwomanliness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unwomanly|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being unwomanly\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unworship", "{\"term\":\"unworship\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|worship|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lack of worship or respect; dishonour\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unwrittenness", "{\"term\":\"unwrittenness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unwritten|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being unwritten\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, John Fiske, \u0027Reading the Popular\u0027 (page 159\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Soap opera is so readily incorporated into everyday life because its formal structures represent the liveness, the nowness, the \u0027\u0027unwrittenness\u0027\u0027 of oral culture\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }