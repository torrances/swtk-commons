package org.swtk.commons.dict.wiktionary.generated.u.s.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUSE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("user", "{\"term\":\"user\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) {{m|enm|user}}, equivalent to {{suffix|use|er|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who uses or makes use of something, a consumer\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://www.economist.com/news/http://www.economist.com/news/asia/21582043-villagers-enjoy-sunlight-after-dark-out-gloom Out of the passage\u003d[Rural solar plant] schemes are of little help to industry or other heavy \u0027\u0027users\u0027\u0027 of electricity. Nor is solar power yet as cheap as the grid. For all that, the rapid arrival of electric light to Indian villages is long overdue. When the national grid suffers its next huge outage, as it did in July 2012 when hundreds of millions were left in the dark, look for specks of light in the villages\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A person who uses drugs, especially illegal drugs\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A person who uses a computer or a computing network, especially a person who has received a user account\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"An exploiter, an abusive user (a person who uses something or someone unfairly, selfishly and/or unethically\", \"priority\":5}]}, \"synonyms\":{}}");

	add("usefulness", "{\"term\":\"usefulness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|useful|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the quality of being useful, to which extent something is usefu\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027usefulness\u0027\u0027 of his latest reorganisation has been disputed\", \"priority\":2}]}, \"synonyms\":{}}");

	add("uselessness", "{\"term\":\"uselessness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|useless|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the quality of being useless\", \"priority\":1}]}, \"synonyms\":{}}");

	add("userbox", "{\"term\":\"userbox\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|user|box|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A simple, standardised box placed on a webpage to indicate the user\u0027s proficiencies or preferences\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, \u0026quot;Lee K Seitz\u0026quot;, \u0027Any Wikipedians here?\u0027 (on Internet newsgroup \u0027rec.games.video.classic\u0027)\u0026amp;nbsp;[http://google.com/group/rec.games.video.classic/msg/51ba37dea182537b\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I wasn\u0027t satisfied with the retrogamer \u0027\u0027userbox\u0027\u0027, so I created a new one\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, John Broughton, \u0027Wikipedia: The Missing Manual\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Creating a \u0027\u0027userbox\u0027\u0027 template for posting on member editors\u0027 user pages\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, \u0026quot;Captain Infinity\u0026quot;, \u0027Kibological Wikipedia \u0027\u0027Userbox\u0027\u0027\u0027 (on Internet newsgroup \u0027alt.religion.kibology\u0027)\u0026amp;nbsp;[http://google.com/group/alt.religion.kibology/msg/8a3e88c17b320af3\", \"priority\":6}]}, \"synonyms\":{}}");

	add("userland", "{\"term\":\"userland\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|user|land|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A conceptual space outside the kernel in which a user\u0027s applications can run without the risk of damage to the operating system\", \"priority\":1}]}, \"synonyms\":{}}");

	add("username", "{\"term\":\"username\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|user|name|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person\u0027s identification on an individual computer system\", \"priority\":1}]}, \"synonyms\":{}}");

	add("userspace", "{\"term\":\"userspace\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|user|space|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The area of memory used for a user\u0027s applications, etc., as opposed to that reserved for the operating system kernel\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A namespace on a wiki used by individual users for personal details and discussions\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }